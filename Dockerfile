FROM maven:3.9.6-eclipse-temurin-21
WORKDIR /app

# Temurin 21.0.13 is not published on Docker Hub yet. Drop the two roots that
# anchor the compromised eMudhra intermediates. emSign Root CA - G1 stays.
RUN keytool -delete -cacerts -storepass changeit \
        -alias "cn_emsign_ecc_root_ca__g3,o_emudhra_technologies_limited,ou_emsign_pki,c_in [jdk]" \
    && keytool -delete -cacerts -storepass changeit \
        -alias "cn_aaa_certificate_services,o_comodo_ca_limited,l_salford,st_greater_manchester,c_gb [jdk]"

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

CMD ["mvn", "test"]
