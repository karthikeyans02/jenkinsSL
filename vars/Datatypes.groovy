String name = "Karthi"
int age = 20
boolean work = true

def interests = ["Groovy", "Python", "Linux", 10]
def hobbies = ["TV", "webserfing", "games"]

// for(interest: interests){
//     println(name + " is interested in " +interest)
// }

// interests.each{println(name + " is interested in " +it)}

// println(interests.size())
// println("name: " +name)
// println("Age: " +age)
// println("Does he work? " +work)



def f1(a, b, c){
    name = a
    for( i = 0; i < b.size(); i++ ){
        println(name + " has " +b[i] + " as interest")
        println(name  + " has " +c[i] + " as hobbie")
}
}

def f2(a){
    return a.size()
}

f1(name, interests, hobbies)

println("Size of the list " +f2(interests))
println(interests.getClass())

def tem = ["Rem" : "1", "rem2" : "2"]
println(tem.rem2)

for(v in tem){
    println(v)
    println(v.key)
    println(v.value)
}