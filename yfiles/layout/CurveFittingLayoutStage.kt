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
import yfiles.lang.ClassMetadata

/**
 * [CurveFittingLayoutStage] fits a piecewise *cubic bezier curve* to given arbitrary edge paths.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new [CurveFittingLayoutStage] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23CurveFittingLayoutStage-constructor-CurveFittingLayoutStage">Online Documentation</a>
 */
external open class CurveFittingLayoutStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to look up the selection state of the edges that defines whether or not an edge's path should be approximated by a bezier curve.
 * 
 * Default value - [DEFAULT_AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the maximum allowed error for the fitting process.
 * 
 * Default value - `4.0`
 * @throws ArgumentError if the specified maximum error is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23maximumError">Online Documentation</a>
 */
open var maximumError: Double
/**
 * Gets or sets the ratio that defines the distance between the intermediate control points and the end points of a cubic segment which actually represents a straight line, i.e., in case the four points are collinear.
 * 
 * Default value - `0.33`
 * @throws ArgumentError if the specified ratio is outside the interval `[0.0, 0.5]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23straightControlPointRatio">Online Documentation</a>
 */
open var straightControlPointRatio: Double
/**
 * Changes the edge paths of selected edges of the given graph such that they represent piecewise cubic bezier curves which approximate the original points of the path.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23CurveFittingLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<CurveFittingLayoutStage> {
/**
 * A data provider key for selecting edges for curve fitting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveFittingLayoutStage%23DEFAULT_AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DEFAULT_AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun CurveFittingLayoutStage(
    block: CurveFittingLayoutStage.() -> Unit
): CurveFittingLayoutStage {
    return CurveFittingLayoutStage()
        .apply(block)
}
