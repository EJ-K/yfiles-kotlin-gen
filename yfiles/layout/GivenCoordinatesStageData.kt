// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.geometry.ISize
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom layout data for the [GivenCoordinatesStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GivenCoordinatesStageData] which helps configuring [GivenCoordinatesStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStageData%23GivenCoordinatesStageData-constructor-GivenCoordinatesStageData">Online Documentation</a>
 */
external open class GivenCoordinatesStageData  () : LayoutData {

/**
 * Gets or sets a mapping from edges to their initial edge paths.
 * @see [GivenCoordinatesStage.EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStageData%23edgePaths">Online Documentation</a>
 */
final var edgePaths: ItemMapping<IEdge, IEnumerable<IPoint>>
/**
 * Gets or sets the mapping from nodes to their initial location.
 * @see [GivenCoordinatesStage.NODE_LOCATION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStageData%23nodeLocations">Online Documentation</a>
 */
final var nodeLocations: ItemMapping<INode, IPoint>
/**
 * Gets or sets the mapping from nodes to their sizes.
 * @see [GivenCoordinatesStage.NODE_SIZE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenCoordinatesStageData%23nodeSizes">Online Documentation</a>
 */
final var nodeSizes: ItemMapping<INode, ISize>

companion object : ClassMetadata<GivenCoordinatesStageData> {
}
}

inline fun GivenCoordinatesStageData(
    block: GivenCoordinatesStageData.() -> Unit
): GivenCoordinatesStageData {
    return GivenCoordinatesStageData()
        .apply(block)
}
