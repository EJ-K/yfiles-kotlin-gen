// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Edge
import yfiles.algorithms.IDataMap
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * The [BusNodePlacer] creates a bus to which all child nodes and the local root node are connected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [BusNodePlacer] instance that uses the transformation defined by the given matrix.
 * @param [modificationMatrix] the transformation matrix. [RotatableNodePlacerMatrix.DEFAULT] if none is provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer%23BusNodePlacer-constructor-BusNodePlacer">Online Documentation</a>
 */
external open class BusNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Creates a [IComparer] for outgoing edges that takes the rotation into account.
 * @return `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer%23BusNodePlacer-method-createComparer">Online Documentation</a>
 */
 override   fun createComparer():IComparer<Edge>?
/**
 * Determines a connector direction for the given child node.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer%23BusNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Determines connector directions depending on whether or not the child nodes are placed above or below the bus.
 * @param [localRoot] the local root
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer%23BusNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Places all children of the local root below and above a bus segment that is shared by the edges.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusNodePlacer%23BusNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<BusNodePlacer> {
}
}

inline fun BusNodePlacer(
    block: BusNodePlacer.() -> Unit
): BusNodePlacer {
    return BusNodePlacer()
        .apply(block)
}
