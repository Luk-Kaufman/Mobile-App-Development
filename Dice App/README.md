# VTM Dice Roller

## Overview

The **VTM Dice Roller** is a mobile app designed for players of *Vampire: The Masquerade* (VTM). It calculates the number of successes based on the number of dice rolled and the specified difficulty level, making gameplay faster and more efficient when large amounts of dice need to rolled at the same time.

---

## Features

- Roll any number of 10-sided dice.
- Set the difficulty level (2–10) to determine successes.
- Automatically count successes and handle critical rolls (multiple 10s count as 2 successes each unless cancled out by a 1).
- Intuitive interface for quick and easy use.

---

## Requirements

- Android 6.0 or later
- 15 MB of space

---

## Installation

1. Download the `.apk` file from the [releases page](#) or your provided source.
2. Transfer the `.apk` to your Android device if downloaded on a computer.
3. On your device, locate the `.apk` file and tap to install it. You may need to enable installations from unknown sources in your device settings.

---

## Usage

1. Open the app.
2. Input:
   - The number of dice to roll.
   - The difficulty level (e.g., 6 for standard difficulty).
3. View the results, including:
   - Rolls for each die.
   - Total successes.
   - Critical successes (if applicable).

## Examples:
1. Dice: 5 Difficulty: 6 Rolls: [8, 10, 4, 7, 10] Successes: 4 (including 2 critical successes)
2. Dice: 5 Difficulty: 2 Rolls: [1, 10, 2, 7, 10] Successes: 4 (including 0 critical successes)
3. Dice: 5 Difficulty: 6 Rolls: [1, 10, 10, 7, 10] Successes: 5 (including 2 critical successes)
4. Dice: 5 Difficulty: 6 Rolls: [1, 10, 10, 10, 10] Successes: 6 (including 3 critical successes)
5. Dice: 5 Difficulty: 6 Rolls: [1, 1, 1, 10, 10] Successes: -1 (including 0 critical successes)

## Rules Summary
- Rolls meeting or exceeding the difficulty level are considered successes.
- Multiple `10s` in a roll (critical success) count as 2 successes each.
- Rolls below the difficulty do not count.
- `1's` eliminate the highest number in a roll unless it is a `1` as well
