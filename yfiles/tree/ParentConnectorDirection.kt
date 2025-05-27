// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [AspectRatioNodePlacer.determineChildConnector]
 * @see [AspectRatioNodePlacer.placeSubtreeOfNode]
 * @see [AssistantNodePlacer.determineChildConnector]
 * @see [AssistantNodePlacer.placeSubtree]
 * @see [AssistantNodePlacer.placeSubtreeOfNode]
 * @see [BusNodePlacer.determineChildConnector]
 * @see [BusNodePlacer.placeSubtreeOfNode]
 * @see [CompactNodePlacer.determineChildConnector]
 * @see [CompactNodePlacer.placeSubtreeOfNode]
 * @see [DefaultNodePlacer.determineChildConnector]
 * @see [DefaultNodePlacer.placeSubtreeOfNode]
 * @see [DelegatingNodePlacer.determineChildConnector]
 * @see [DelegatingNodePlacer.placeSubtree]
 * @see [DelegatingNodePlacer.placeSubtreeOfNode]
 * @see [DendrogramNodePlacer.placeSubtree]
 * @see [DoubleLineNodePlacer.determineChildConnector]
 * @see [DoubleLineNodePlacer.placeSubtreeOfNode]
 * @see [FreeNodePlacer.determineChildConnector]
 * @see [FreeNodePlacer.placeSubtreeOfNode]
 * @see [GridNodePlacer.determineChildConnector]
 * @see [GridNodePlacer.placeSubtreeOfNode]
 * @see [GroupedNodePlacer.placeSubtree]
 * @see [INodePlacer.placeSubtree]
 * @see [LayeredNodePlacer.determineChildConnector]
 * @see [LayeredNodePlacer.placeSubtreeOfNode]
 * @see [LeafNodePlacer.placeSubtree]
 * @see [LeftRightNodePlacer.determineChildConnector]
 * @see [LeftRightNodePlacer.placeSubtreeOfNode]
 * @see [NodePlacerBase.determineChildConnector]
 * @see [NodePlacerBase.placeSubtree]
 * @see [RotatableNodePlacerBase.determineChildConnector]
 * @see [RotatableNodePlacerBase.placeSubtree]
 * @see [RotatableNodePlacerBase.translateDirectionToModel]
 * @see [RotatableNodePlacerBase.translateDirectionToReal]
 * @see [SimpleNodePlacer.determineChildConnector]
 * @see [SimpleNodePlacer.placeSubtreeOfNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection">Online Documentation</a>
 */
external sealed class ParentConnectorDirection: YEnum<ParentConnectorDirection> {
   companion object: EnumMetadata<ParentConnectorDirection> {
       /**
 * Direction specifier which indicates that no connector should be calculated.
 * 
 * Value - `-2`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23NONE">Online Documentation</a>
 */
val NONE: ParentConnectorDirection

/**
 * Direction specifier which indicates that any direction can be used for the connector to the parent node.
 * 
 * Value - `-1`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23ANY">Online Documentation</a>
 */
val ANY: ParentConnectorDirection

/**
 * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes north.
 * 
 * Value - `0`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23NORTH">Online Documentation</a>
 */
val NORTH: ParentConnectorDirection

/**
 * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes east.
 * 
 * Value - `1`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23EAST">Online Documentation</a>
 */
val EAST: ParentConnectorDirection

/**
 * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes south.
 * 
 * Value - `2`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23SOUTH">Online Documentation</a>
 */
val SOUTH: ParentConnectorDirection

/**
 * Direction specifier which indicates that the connector to the parent node should end in a segment that can be extended by a segment that goes west.
 * 
 * Value - `3`
 * @see [INodePlacer.placeSubtree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentConnectorDirection%23WEST">Online Documentation</a>
 */
val WEST: ParentConnectorDirection
   }
}
