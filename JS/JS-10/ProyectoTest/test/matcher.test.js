test('object assignment', () => {
    const data = { one: 1 };
    data['two'] = 2;
    expect(data).toEqual({ one: 1, two: 2 });
});
//El codigo npm test -- --watch.matcher.js es para que se ejecute el test automaticamente cada vez que se modifique el codigo.