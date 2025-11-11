function dodajZadatak() {
    let input = document.getElementById('input');
    let lista = document.getElementById('lista');

    let zadatak = document.createElement('li');

    let tekst = document.createElement('p');
    tekst.textContent = input.value;
    zadatak.appendChild(tekst);

    tekst.addEventListener('click', function () {
        zadatak.classList.toggle('done');
    });

    let dugme = document.createElement('button');
    dugme.textContent = 'X';
    dugme.addEventListener('click', function () {
        zadatak.remove();
    });
    zadatak.appendChild(dugme);

    lista.appendChild(zadatak);
}