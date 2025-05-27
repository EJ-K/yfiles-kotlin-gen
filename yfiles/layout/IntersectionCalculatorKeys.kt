// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey

/**
 * Helper class that declares several keys for [IDataProvider][yfiles.algorithms.IDataProvider] that provide [IIntersectionCalculator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionCalculatorKeys">Online Documentation</a>
 */
external object IntersectionCalculatorKeys {
/**
 * A data provider key for providing an individual intersection calculation for each edge source in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionCalculatorKeys%23SOURCE_INTERSECTION_CALCULATOR_DP_KEY">Online Documentation</a>
 */
 val SOURCE_INTERSECTION_CALCULATOR_DP_KEY: EdgeDpKey<IIntersectionCalculator>
/**
 * A data provider key for providing an individual intersection calculation for each edge target in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionCalculatorKeys%23TARGET_INTERSECTION_CALCULATOR_DP_KEY">Online Documentation</a>
 */
 val TARGET_INTERSECTION_CALCULATOR_DP_KEY: EdgeDpKey<IIntersectionCalculator>
}
