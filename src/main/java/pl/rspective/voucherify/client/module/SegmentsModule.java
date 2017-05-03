package pl.rspective.voucherify.client.module;

import pl.rspective.voucherify.client.api.VoucherifyApi;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;
import pl.rspective.voucherify.client.model.segment.Segment;
import pl.rspective.voucherify.client.model.segment.response.SegmentResponse;
import pl.rspective.voucherify.client.module.SegmentsModule.ExtAsync;
import pl.rspective.voucherify.client.module.SegmentsModule.ExtRxJava;
import pl.rspective.voucherify.client.utils.RxUtils;
import rx.Observable;

import java.util.concurrent.Executor;

public final class SegmentsModule extends AbsModule<ExtAsync, ExtRxJava> {

  public SegmentsModule(VoucherifyApi api, Executor executor) {
    super(api, executor);
  }

  public SegmentResponse create(Segment segment) {
    return api.createSegment(segment);
  }

  public SegmentResponse get(String id) {
    return api.getSegment(id);
  }

  public void delete(String id) {
    api.deleteSegment(id);
  }

  @Override
  ExtAsync createAsyncExtension() {
    return new ExtAsync();
  }

  @Override
  ExtRxJava createRxJavaExtension() {
    return new ExtRxJava();
  }

  @Override
  public ExtAsync async() {
    return extAsync;
  }

  @Override
  public ExtRxJava rx() {
    return extRxJava;
  }

  public class ExtAsync extends AbsModule.Async {

    public void create(Segment segment, VoucherifyCallback<SegmentResponse> callback) {
      RxUtils.subscribe(executor, rx().create(segment), callback);
    }

    public void get(String id, VoucherifyCallback<SegmentResponse> callback) {
      RxUtils.subscribe(executor, rx().get(id), callback);
    }

    public void delete(String id, VoucherifyCallback<Void> callback) {
      RxUtils.subscribe(executor, rx().delete(id), callback);
    }
  }

  public class ExtRxJava extends AbsModule.Rx {

    public Observable<SegmentResponse> create(final Segment segment) {
      return RxUtils.defer(new RxUtils.DefFunc<SegmentResponse>() {
        @Override
        public SegmentResponse method() {
          return SegmentsModule.this.create(segment);
        }
      });
    }

    public Observable<SegmentResponse> get(final String id) {
      return RxUtils.defer(new RxUtils.DefFunc<SegmentResponse>() {
        @Override
        public SegmentResponse method() {
          return SegmentsModule.this.get(id);
        }
      });
    }

    public Observable<Void> delete(final String id) {
      return RxUtils.defer(new RxUtils.DefFunc<Void>() {
        @Override
        public Void method() {
          SegmentsModule.this.delete(id);
          return null;
        }
      });
    }
  }
}