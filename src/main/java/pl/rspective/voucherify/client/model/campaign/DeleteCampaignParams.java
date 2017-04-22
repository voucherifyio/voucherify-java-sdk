package pl.rspective.voucherify.client.model.campaign;

public class DeleteCampaignParams {

    private Boolean force;

    private DeleteCampaignParams() {
    }

    private DeleteCampaignParams(Boolean force) {
        this.force = force;
    }

    public Boolean getForce() {
        return force;
    }

    public static class Builder {

        private Boolean force;

        public Builder() {
        }

        public Builder(Boolean force) {
            this.force = force;
        }

        public Builder setForce(Boolean force) {
            this.force = force;
            return this;
        }

        public DeleteCampaignParams build() {
            return new DeleteCampaignParams(force);
        }
    }
}
