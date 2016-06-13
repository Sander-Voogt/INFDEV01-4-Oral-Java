package case1;

//TODO Rename this file to the correct name and complete missing line: 1 point
{
    int current;

    public EvensFrom(int start) {
        this.current = start - 1;
    }

    public Integer getCurrent() {
        return this.current;
    }

    public void moveNext() {
        current = current + 1;
//TODO Missing lines: 1 point
    }

    public boolean hasNext() {
        return true;
    }

}
