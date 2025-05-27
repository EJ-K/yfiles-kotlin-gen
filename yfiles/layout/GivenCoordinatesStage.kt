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
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YDimension
import yfiles.algorithms.YPoint
import yfiles.algorithms.YPointPath
import yfiles.lang.ClassMetadata

/**
 * [GivenCoordinatesStage] changes node locations and sizes as well as edge paths to user-specified values before invoking the [core layout algorithm][LayoutStageBase.coreLayout].
 * @see [PlaceNodesAtBarycenterStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage">Online Documentation</a>
 * 
 * @constructor Creates a new [GivenCoordinatesStage] instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage%23GivenCoordinatesStage-constructor-GivenCoordinatesStage">Online Documentation</a>
 */
external open class GivenCoordinatesStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Changes node locations and edge paths to user-specified values and then invokes the core layout algorithm.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage%23GivenCoordinatesStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<GivenCoordinatesStage> {
/**
 * A data provider key for specifying the initial path of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage%23EDGE_PATH_DP_KEY">Online Documentation</a>
 */
 val EDGE_PATH_DP_KEY: EdgeDpKey<YPointPath>
/**
 * A data provider key for specifying the initial location of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage%23NODE_LOCATION_DP_KEY">Online Documentation</a>
 */
 val NODE_LOCATION_DP_KEY: NodeDpKey<YPoint>
/**
 * A data provider key for specifying the size of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStage%23NODE_SIZE_DP_KEY">Online Documentation</a>
 */
 val NODE_SIZE_DP_KEY: NodeDpKey<YDimension>
}
}

inline fun GivenCoordinatesStage(
    block: GivenCoordinatesStage.() -> Unit
): GivenCoordinatesStage {
    return GivenCoordinatesStage()
        .apply(block)
}
