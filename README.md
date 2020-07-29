# simple_unit

# これは何？
簡単なUnitTestとUIテストを実装し（Java:Android）、JacocoによってCoverageを表示する為のサンプルです。

# 動作確認環境
- **macOS** Version: 10.14.6
- **Android Studio** Version: 4.0
- **Android Emulator** API Version: 28
- **JAVA** Version: jdk1.8.0_191 (OpenJDKでは動作しません)
- **Gradle** Version: [6.4.1](https://services.gradle.org/distributions/gradle-6.4.1-all.zip)

# 動作に関して
Terminalから以下のコマンドで表示できています。なお、Androidエミュレータを起動したから以下を実行してください。

```bash
$ ./gradlew clean && ./gradlew build
$ ./gradlew connectedAndroidTest
```
以上でHTML形式のレポートが `app/build/reports/` にできているはずですのでブラウザで表示してください。  

※1 `./gradlew connectedAndroidTest` はAndroidデバイス（物理or仮想）が接続されていないと動作しません。  
※2 テスト開始に失敗する可能性があるので、その場合は何度か試してください。

- `coverage` : Jacocoからのカバレッジレポート（UnitTestとUIテストが統合されて表示されます）
- `tests/testDebugUnitTest` : UnitTestのテスト結果レポート
- `androidTests/connected/` : UIテストの結果レポート

# 分かったこと
100％自信を持って、とは言えない調査レベルで、動作させてみた傾向から以下は言えるだろう、というニュアンスです。

- JacocoはAndroidアプリ全体に対してカバレッジを表示するので、カバレッジを表示するにはUnitTestのみでは不可能。
- OpenJDKではJacocoは動作しなさそう


# 参考サイト

- [Test from the command line  |  Android Developers](https://developer.android.com/studio/test/command-line)
- [Android開発のテストカバー率取得にはこのツールを使い分けると良いという話 - Qiita](https://qiita.com/keidroid/items/adc4f065b84d8a2cd17a)

