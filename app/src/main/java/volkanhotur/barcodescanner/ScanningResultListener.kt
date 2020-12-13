package volkanhotur.barcodescanner

interface ScanningResultListener {
    fun onScanned(result: String)
}