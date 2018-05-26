const path = require('path');
const KotlinPlugin = require('@jetbrains/kotlin-webpack-plugin');

module.exports = {
    mode: 'development',

    target: 'node',

    entry: 'kotlinApp',

    resolve: {
        modules: ['kotlin_build', 'node_modules']
    },

    plugins: [
        new KotlinPlugin({
            src: [
                // path.resolve('types'),
                path.resolve('src')
            ]
        })
    ]
};
