/**
 * @param {number[]} height
 * @return {number}
 */
const trap = (height) => {
    let prefix = [];
    let suffix = [];
    let vol = 0;

    if (height.length === 0) return 0;

    prefix[0] = height[0];
    suffix[height.length - 1] = height[height.length - 1];

    for (let i = 1; i < height.length; i++) {
        prefix[i] = Math.max(prefix[i - 1], height[i]);
    }

    for (let i = height.length - 2; i >= 0; i--) {
        suffix[i] = Math.max(suffix[i + 1], height[i]);
    }

    for (let i = 0; i < height.length; i++) {
        let water = Math.min(suffix[i], prefix[i]) - height[i];
        vol += (water > 0) ? water : 0;
    }

    return vol;
};