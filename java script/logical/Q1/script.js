function celsius(fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

function Q1(form) {
    const fahrenheit = form.f.value;
    const c = celsius(fahrenheit);
    console.log(`The temperature in celsius is ${c}`);
    document.getElementById("hello").innerHTML = `The temperature in celsius is ${c}&degC`  ;
}