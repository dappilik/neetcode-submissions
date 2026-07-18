class MinStack {
    private List<Integer> list;
    private List<Integer> minList;

    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);
        if (minList.isEmpty()) {
            minList.add(val);
        } else {
            minList.add(Math.min(minList.getLast(), val));
        }
    }

    public void pop() {
        list.removeLast();
        minList.removeLast();
    }

    public int top() {
        return list.getLast();
    }

    public int getMin() {
        return minList.getLast();
    }
}
