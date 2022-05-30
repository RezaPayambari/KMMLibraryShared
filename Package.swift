// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "KMMsharedModule",
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: "KMMsharedModule",
            targets: ["KMMsharedModule"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "KMMsharedModule",
            path: "./KMMsharedModule.xcframework"
        ),
    ]
)
