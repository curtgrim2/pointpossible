# Point Possible
### Description: 
Calculates every possible way scoring total was reached (Currently for NFL Football) 

### How it was done:
 Instead of using a mathematical equation, I decided to make this my own way with my own method. After the user inputs the total number of points scored by one team, the first thing the program checks is how many times does each scoring type has to add up before meeting or surpassing the total score respectively. After those totals are recorded, the program sets the foundation of the calculation by starting off with the touchdown evalution (6 points + 1 extra point).

**(Tech Talk: Using the max referenced total touchdowns, we take a for loop and descend from the original number through 0 TD's. For each number of TD's in each loop iteration, the actual number of those points are calculated in the following while loop after the for loop declaration.)**

After we have the current point value from just touchdowns, there are two paths that can be taken from there. The first is if the touchdowns for that loop equates to the number of points the team scored. If true, that loop iteration is considered a success (That means the program outputs the "success message", the 'testtotal' variable gets reset to zero, and the for loop goes to the next possible iteration.) 

The second path occurs if the touchdown only total is not equvalent to the total team points. In that case, the program now moves on to the field goal section of the evaluation (3 points). (There is a place holder for the total number of points that we accumulated with the current number of touchdowns for that iteration. 

From here there is another 2 paths that can be taken. If the  overall calculated points with the current number of field points accounted for equates to the actual team point total, the iteration is deemed a success. If they don't equal to each other, we now must evaluate for safeties in the score. (The logic for safeties is identical to the field goal logic).

After the complete run concludes and the successful runs with the totals of each scoring type is outputted, the total number of calculated possibilities is displayed and the program ends.

**FIN.**
=======
# React + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Oxc](https://oxc.rs)
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/)

## React Compiler

The React Compiler is enabled on this template. See [this documentation](https://react.dev/learn/react-compiler) for more information.

Note: This will impact Vite dev & build performances.
You can also try [the experimental native React Compiler support in plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react/README.md#rust-react-compiler) by using `compiler: true` in the plugin options instead of using the Babel plugin.

## Expanding the ESLint configuration

If you are developing a production application, we recommend using TypeScript with type-aware lint rules enabled. Check out the [TS template](https://github.com/vitejs/vite/tree/main/packages/create-vite/template-react-ts) for information on how to integrate TypeScript and [`typescript-eslint`](https://typescript-eslint.io) in your project.
>>>>>>> a0a28bb (Combining with React)
