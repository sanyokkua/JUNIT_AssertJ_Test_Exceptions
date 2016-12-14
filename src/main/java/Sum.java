class Sum {

    int sum(int arg1, int arg2) {
        if (isInRange(arg1) && isInRange(arg2)) {
            return arg1 + arg2;
        }
        throw new IllegalArgumentException("Arguments is not in correct range");
    }

    boolean isInRange(int arg) {
        return arg >= 0 && arg <= 10;
    }
}
