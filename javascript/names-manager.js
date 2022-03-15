var names=[];
function addNames(){
    let name = document.getElementById("nametxt").value;
    names.push(name);
    refreshList();

}


function refreshList(){
    let txt = "";
    for(let i=0; i<names.length; i++){
        txt+="<li>"+names[i]+"</li>";
    }
    document.getElementById("namelist").innerHTML=txt;
}