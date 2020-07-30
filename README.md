# simple_unit

# これは何？
簡単なUnitTestとUIテストを実装し（Java:Android）、JaCoCoによってCoverageを表示する為のサンプルです。

# 動作確認環境
- **macOS** Version: 10.14.6
- **Android Studio** Version: 4.0
- **Android Emulator** API Version: 28
- **JAVA** Version: jdk1.8.0_191 (OpenJDKでは動作しません)
- **Gradle** Version: [6.4.1](https://services.gradle.org/distributions/gradle-6.4.1-all.zip)

# 動作に関して
Terminalから以下のコマンドで表示できています。なお、Androidエミュレータを起動したから以下を実行してください。

## Unit Test, Instrumented Testの両方の結果を取得
```bash
$ ./gradlew clean lint test
$ ./gradlew connectedAndroidTest
```
以上でHTML形式のレポートが `app/build/reports/` にできているはずですのでブラウザで表示してください。  

※1 `./gradlew connectedAndroidTest` はAndroidデバイス（物理or仮想）が接続されていないと動作しません。  
※2 テスト開始に失敗する可能性があるので、その場合は何度か試してください。

- `app/build/reports/lint-results.html ` : Lintの結果レポート
- `app/build/reports/tests` : ターゲットBuild毎のテスト結果レポート
- `app/build/reports/coverage` : JaCoCoからのカバレッジレポート（UnitTestとUIテストが統合されて表示されます）
- `app/build/reports/androidTests/connected` : UIテストの結果レポート

## Unit Testのみの結果を取得
```bash
$ ./gradlew clean lint jacocoTestReport
```
- `app/build/reports/lint-results.html ` : Lintの結果レポート
- `app/build/reports/tests` : ターゲットBuild毎のテスト結果レポート
- `app/build/jacoco/jacocoHtml` : UnitTestのみのテスト結果レポート

# 分かったこと
以下の内容は、100％自信を持ってとは言えない調査レベルで、動作させてみた傾向から以下は言えるだろう、というニュアンスです。

- JaCoCoに関して
  - `./gradlew jacocoTestReport` を実施することで、Insttrumentedテストを知なくとも、UIテスト0%の状態で結果を得ることができる。
  - OpenJDKでは動作しない（jdkがAndroid Studioのデフォルトなので、Terminalから動作させる場合のみ注意）

# ライセンス
Apache License 2.0 です。詳細はLICENSE を御覧ください。

```
   Copyright 2020 Ryoya Kawai

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

```


# 参考サイト
- [The JaCoCo Plugin](https://docs.gradle.org/current/userguide/jacoco_plugin.html)
- [Test from the command line  |  Android Developers](https://developer.android.com/studio/test/command-line)
- [Android開発のテストカバー率取得にはこのツールを使い分けると良いという話 - Qiita](https://qiita.com/keidroid/items/adc4f065b84d8a2cd17a)


