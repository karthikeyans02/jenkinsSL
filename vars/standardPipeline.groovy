
// def call(Param){
//     println('name is ' +Param.name)
//     println('Value is ' +Param.value)
// }

def call(Param){
    node{
        stage('Build'){
            println('name is ' +Param.name)
            println('Value is ' +Param.value)
        }
    }
    
}
