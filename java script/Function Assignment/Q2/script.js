function square(x){
    return x*x;
}
function double(x){
    return x*2;
}
function composedValue1(f1,f2,f){
    return(f1(f2(f)));
}
function composedValue2(f1,f2,f){
    return(f1(f2(f)));
}
function Q2(){
    alert(composedValue1(square,double,parseInt(prompt ('enter the Number'))));
    alert(composedValue2(double,square,parseInt(prompt ('enter the Number'))));
}