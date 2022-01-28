def call(body) {
    def en = new com.sap.ms.ENV()
    return en.isProduction()
}