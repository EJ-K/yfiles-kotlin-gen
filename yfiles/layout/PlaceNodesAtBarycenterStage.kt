// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YDimension
import yfiles.lang.ClassMetadata

/**
 * [PlaceNodesAtBarycenterStage] temporarily hides the [affected nodes][AFFECTED_NODES_DP_KEY], applies the specified core layout algorithm (if any) to the resulting graph and, finally, reinserts the hidden nodes by placing them on the barycenter of their neighbors using the specified [node sizes][AFFECTED_NODES_SIZE_DP_KEY].
 * @see [GivenCoordinatesStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage">Online Documentation</a>
 * 
 * @constructor Creates a new [PlaceNodesAtBarycenterStage] instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-constructor-PlaceNodesAtBarycenterStage">Online Documentation</a>
 */
external open class PlaceNodesAtBarycenterStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not the grouping structure should be considered.
 * 
 * Default value - `true`. The grouping structure is considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23considerGrouping">Online Documentation</a>
 */
open var considerGrouping: Boolean
/**
 * Gets or sets whether or not bends of edges incident to [affected nodes][AFFECTED_NODES_DP_KEY] should be removed.
 * 
 * Default value - `true`. Bends should be removed.
 * @see [resetPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23removeBends">Online Documentation</a>
 */
open var removeBends: Boolean
/**
 * Gets or sets whether or not ports of edges incident to [affected nodes][AFFECTED_NODES_DP_KEY] should be set to the center of the corresponding nodes.
 * 
 * Default value - `false`. Ports are not set to the center.
 * @see [removeBends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23resetPorts">Online Documentation</a>
 */
open var resetPorts: Boolean
/**
 * Starts the layout.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23PlaceNodesAtBarycenterStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<PlaceNodesAtBarycenterStage> {
/**
 * A data provider key for determining which nodes should be placed by this stage.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23AFFECTED_NODES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying the size of affected nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlaceNodesAtBarycenterStage%23AFFECTED_NODES_SIZE_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_SIZE_DP_KEY: NodeDpKey<YDimension>
}
}

inline fun PlaceNodesAtBarycenterStage(
    block: PlaceNodesAtBarycenterStage.() -> Unit
): PlaceNodesAtBarycenterStage {
    return PlaceNodesAtBarycenterStage()
        .apply(block)
}
