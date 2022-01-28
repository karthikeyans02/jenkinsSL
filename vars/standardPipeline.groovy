import com.sap.ms.ENV
// def call(Param){
//     println('name is ' +Param.name)
//     println('Value is ' +Param.value)
// }

// def call(Param){
//     node{
//         stage('Build'){
//             println('name is ' +Param.name)
//             println('Value is ' +Param.value)
//         }
//     }
    
// }


def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    if (!isProduction {}) {
        node{

        //Implemention of params

            def jobParameters = [
                    string(defaultValue: "", description: 'Product Path', name: 'PRODUCT_PATH', trim: false),
                    string(defaultValue: '', description: 'Build Number', name: 'BUILD_NUMBER', trim: false),
                    string(defaultValue: '', description: 'Enter an existing HOA JIRA issue (leave it empty to automatically create a new one)', name: 'HOA_TICKET', trim: true),
                    string(defaultValue: "", description: 'Comma Separated Prod Deploy Modes', name: 'PROD_DEPLOY_MODES', trim: false)
                ]
        // properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '90', numToKeepStr: '20')), disableConcurrentBuilds(), parameters(jobParameters), pipelineTriggers(config.periodicTrigger)])
            def productPath     = params.PRODUCT_PATH
            def buildNumberEx   = params.BUILD_NUMBER
            currentBuild.displayName = buildNumberEx
            def buildPath   = "workarea/${productPath}/${buildNumberEx}"
            

        //Ends here
        }

            
    }
        

    stage('New closures'){
                println('Name is ' +config.Name)
                println('Value is ' +config.Value)
    }
    
}