
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

    node{
        stage('New closures'){
            println('name is ' +config.name)
            println('Value is ' +config.value)
        }
    }
    
}