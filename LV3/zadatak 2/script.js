function addTask() {
    let input = document.getElementById('task-input');
    let list = document.getElementById('todo-list');
    let text = input.value;

    let li = document.createElement('li');

    let span = document.createElement('span');
    span.className = 'text';
    span.textContent = text;
    span.addEventListener('click', function () {
        li.classList.toggle('done');
    });

    let actions = document.createElement('div');
    actions.className = 'actions';

    let del = document.createElement('button');
    del.className = 'delete';
    del.type = 'button';
    del.textContent = 'X';
    del.addEventListener('click', function () {
        li.remove();
    });

    actions.appendChild(del);
    li.appendChild(span);
    li.appendChild(actions);

    list.appendChild(li);
    input.value = '';
}