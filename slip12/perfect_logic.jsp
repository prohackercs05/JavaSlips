<%
    // This logic file determines if a number 'n' is perfect
    String numStr = request.getParameter("num");
    boolean isPerfect = false;
    int n = 0;

    if (numStr != null) {
        n = Integer.parseInt(numStr);
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n && n > 0) {
            isPerfect = true;
        }
    }
%>
