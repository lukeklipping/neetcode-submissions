class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones){ // n
            maxHeap.add(s); //logn
        }

        while(maxHeap.size() > 1){ //n
            int x = maxHeap.poll(); // heaviest
            int y = maxHeap.poll(); // second heaviest
            if(y < x){
                maxHeap.add(x - y);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
