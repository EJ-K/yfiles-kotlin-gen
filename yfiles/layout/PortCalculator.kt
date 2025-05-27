// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * A [PortCalculator] can be applied to move ports from the nodes' rectangular bounds to the actual outline.
 * @see [IIntersectionCalculator]
 * @see [IntersectionCalculatorKeys.SOURCE_INTERSECTION_CALCULATOR_DP_KEY]
 * @see [IntersectionCalculatorKeys.TARGET_INTERSECTION_CALCULATOR_DP_KEY]
 * @see [PortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator">Online Documentation</a>
 * 
 * @constructor Creates a new [PortCalculator] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator%23PortCalculator-constructor-PortCalculator">Online Documentation</a>
 */
external open class PortCalculator  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase, ILayoutStage {

/**
 * EPSILON used by [equalsEps].
 * 
 * By default this is `0.2`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator%23Eps">Online Documentation</a>
 */
protected final var Eps: Double
/**
 * Adjusts the ports after invoking the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator%23PortCalculator-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Performs the actual port calculation on the specified graph instance.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator%23PortCalculator-method-calculatePorts">Online Documentation</a>
 */
 open protected   fun calculatePorts( graph: LayoutGraph )
/**
 * Determines whether two points are equal.
 * @param [x1] the x-coordinate of the first point
 * @param [y1] the y-coordinate of the first point
 * @param [x2] the x-coordinate of the second point
 * @param [y2] the y-coordinate of the second point
 * @return `true` if both points are considered equal, `false` otherwise
 * @see [calculatePorts]
 * @see [Eps]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCalculator%23PortCalculator-method-equalsEps">Online Documentation</a>
 */
 open protected   fun equalsEps( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Boolean

companion object : ClassMetadata<PortCalculator> {
}
}

inline fun PortCalculator(
    block: PortCalculator.() -> Unit
): PortCalculator {
    return PortCalculator()
        .apply(block)
}
