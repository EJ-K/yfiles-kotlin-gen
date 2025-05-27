// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * The [GridNodePlacer] arranges the shapes of the children of a local root in a grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [GridNodePlacer] instance with the given [modification matrix][RotatableNodePlacerBase.modificationMatrix] and [root alignment][rootAlignment].
 * @param [modificationMatrix] the transformation matrix for this [RotatableNodePlacerBase]
 * @param [rootAlignment] the alignment of the local root with its subtrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23GridNodePlacer-constructor-GridNodePlacer">Online Documentation</a>
 */
external open class GridNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally,
 rootAlignment: RootNodeAlignment?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets whether or not the nodes are automatically assigned to the rows of the grid.
 * 
 * Default value - `false`. The rows are user-specified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23automaticRowAssignment">Online Documentation</a>
 */
open var automaticRowAssignment: Boolean
/**
 * Gets or sets the placement of the bus with respect to the child node grid.
 * 
 * Default value - [BusPlacement.LEADING]. The bus is placed leading, left of the grid structure.
 * @throws ArgumentError if the given bus placement is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23busPlacement">Online Documentation</a>
 */
open var busPlacement: BusPlacement
/**
 * Gets or sets the [RootAlginment][RootNodeAlignment] that defines how the root node is aligned with its children and their shapes.
 * 
 * Default value - [BUS_ALIGNED]
 * @throws ArgumentError if the given root alignment is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23rootAlignment">Online Documentation</a>
 */
open var rootAlignment: RootNodeAlignment
/**
 * Creates a [IComparer] that sorts the outgoing edges according to the rows and x-coordinates of their target nodes.
 * @return a [IComparer] that orders edges lexicographically by row and x-coordinates of their target nodes
 * @see [ROW_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23GridNodePlacer-method-createFromSketchComparer">Online Documentation</a>
 */
 override   fun createFromSketchComparer():IComparer<Node>
/**
 * Returns [ParentConnectorDirection.NORTH] for every given child node.
 * @return [ParentConnectorDirection.NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23GridNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Places the children of a local root node in a grid.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23GridNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<GridNodePlacer> {
/**
 * Horizontal [RootNodeAlignment] with the bus of the grid so that the position of the root depends on the selected [bus placement][busPlacement].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23BUS_ALIGNED">Online Documentation</a>
 */
 val BUS_ALIGNED: RootNodeAlignment
/**
 * A data provider key for assigning nodes to the rows in the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridNodePlacer%23ROW_INDEX_DP_KEY">Online Documentation</a>
 */
 val ROW_INDEX_DP_KEY: NodeDpKey<Int>
}
}

inline fun GridNodePlacer(
    block: GridNodePlacer.() -> Unit
): GridNodePlacer {
    return GridNodePlacer()
        .apply(block)
}
