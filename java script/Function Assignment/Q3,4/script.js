//question3
function Q3(){
    
    var arr = [3, 7, 19, 8, 2];
    const isEven = x => x % 2 === 0; //
    var i = 0;
    while(i<arr.length){
        if(isEven(arr[i])){
            var even = arr[i];
            break;
        }
        i++;
    }
    document.getElementById('hello').innerHTML = `The even number is ${even}`;
}
//question4
function Q4(){ 
    var result = Map(square,arr);
    document.getElementById('hello').innerHTML = `Orginal  Array <br> [ ${arr} ]<br>The result of map of square of array is : [ ${result} ]`;
    document.getElementById('hello').innerHTML += `<br>The result of map of sqrt of array is : <br> [ ${Map(Math.sqrt,arr)} ]`;
    
    }
   var arr = [3, 7, 19, 8, 2];
function Map(f,arr){  // Here we are giving f=square method 
    
    var result = [];
    for(var i=0;i<arr.length;i++){
        result.push(f(arr[i]));
    }
    return result;
}