def isProduction() {
    return (env.IS_PRODUCTION == null) ? false : env.IS_PRODUCTION.toBoolean()
}