function square(x){
    return x*x;
}
function double(x){
    return x*2;
}
function composedValue(f1,f2,f){
    return(f1(f2(f)));
}
function Q1(){
    alert(composedValue(square,double,parseInt(prompt ('enter the Number'))));
}