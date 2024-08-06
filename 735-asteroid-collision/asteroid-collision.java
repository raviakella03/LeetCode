class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> result = new Stack<>();
        for(int asteroid : asteroids) {
            boolean collision = false;
            while(!result.empty() && asteroid < 0 && result.peek() > 0) {
                if(result.peek() < -asteroid) {
                    result.pop();
                    continue;
                } else if(result.peek() == -asteroid) {
                    result.pop();
                }
                collision = true;
                break;
            }
            if(!collision)
                result.push(asteroid);
        }
        return result.stream().mapToInt(t -> t).toArray();
    }
}