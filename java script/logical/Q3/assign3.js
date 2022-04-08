
function Q3(){
    var result = "<table>";
    var i = 1;
    var j = 0;
    var rows = parseInt(prompt("Enter the number of rows"));
    var cols = parseInt(prompt("Enter the number of columns"));
    var tr = "<tr>";
    var td = "<td>lorem</td>";
    var tr2 = "</tr>";
    result += tr;
    while(i<=cols){
        result +=  "<th> col"+i+"</th>" ;
        i++;
    }
    result += tr2;
    while(j <= rows){
        result += tr+td.repeat(cols)+tr2;
        j++;
    }
    result += "</table>";
    console.log(result);
    document.getElementById("hello").innerHTML = result;
}