var persons=[];
let addPerson = function(){
    let name = document.getElementById("nametxt").value;
    let email = document.getElementById("emailtxt").value;
    let age = document.getElementById("agetxt").value;
    let person = new Person(name,email,age);
    persons.push(person);
    refreshList();

}

let fun = personName => personName.toString().toUpperCase();


function refreshList(){
    let txt = "";
    for(let i=0; i<persons.length; i++){
        txt+="<li>"+persons[i].toString()+"</li>";
        console.log(persons[i])
    }
    document.getElementById("namelist").innerHTML=txt;
}

class Person{
    constructor(name,email,age){
        this.name=name;
        this.age=age;
        this.email=email;
    }
    toString(){
        return this.name+" -- "+this.email+" -- "+this.age;
    }
}