int[] average_grades(int grades[][], int weights[]) {
    int[] averages = new int[grades.length];
    for (int i = 0; i < grades.length; i++) {
        int total = 0;
        for (int j = 0; j < grades[i].length; j++) {
            total += grades[i][j] * weights[j]; 
        }
        averages[i] = total / 100; 
    }
    return averages; 
}
