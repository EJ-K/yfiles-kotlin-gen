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
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * The [LeftRightNodePlacer] arranges the children in a subtree on the left and the right of a vertical bus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [LeftRightNodePlacer] instance using the given modification matrix.
 * @param [modificationMatrix] the transformation matrix for this [RotatableNodePlacerBase]. [RotatableNodePlacerMatrix.DEFAULT] if none is provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-constructor-LeftRightNodePlacer">Online Documentation</a>
 */
external open class LeftRightNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets the number of branches (buses) of the subtree layout.
 * 
 * Default value - `1`. The layout consists of a single branch.
 * @throws ArgumentError if the given branch count is smaller than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23branchCount">Online Documentation</a>
 */
open var branchCount: Int
/**
 * Gets or sets the horizontal distance between nodes or subtrees.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23horizontalDistance">Online Documentation</a>
 */
open var horizontalDistance: Double
/**
 * Gets or sets whether or not the last child is placed centered, aligned with the bus and below the other child nodes.
 * 
 * Default value - `true`. The last child is centered below its siblings
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23placeLastOnBottom">Online Documentation</a>
 */
open var placeLastOnBottom: Boolean
/**
 * Sets a uniform horizontal and vertical spacing between subtrees.
 * @throws ArgumentError if the specified spacing value is negative
 * @see [horizontalDistance]
 * @see [verticalDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23spacing">Online Documentation</a>
 */
override var spacing: Double
/**
 * Gets or sets the vertical distance between nodes or subtrees.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23verticalDistance">Online Documentation</a>
 */
open var verticalDistance: Double
/**
 * Returns a [IComparer] for outgoing edges that considers the locations of the target nodes.
 * @return the [IComparer] that compares outgoing edges according to the locations of their target nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-createComparer">Online Documentation</a>
 */
 override   fun createComparer():IComparer<Edge>?
/**
 * Creates a processor that distributes the child elements into multiple branches, if necessary.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return the processor distributing children to multiple branches or `null` if only a single-branch layout is created
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Determines the direction of the child connectors according to which side of the bus the child is assigned.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see [placeLastOnBottom]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Places the subtree shapes of the children left and right of a common vertical bus.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<LeftRightNodePlacer> {
/**
 * A data provider key for assigning nodes to the left or the right side of the bus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LEFT_RIGHT_DP_KEY">Online Documentation</a>
 */
 val LEFT_RIGHT_DP_KEY: NodeDpKey<Boolean>
/**
 * Creates a special [IDataProvider] that determines whether a given node is placed left or right of the parent node.
 * @param [nodePlacerMap] a [IDataProvider] containing the corresponding [INodePlacer]s for the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeftRightNodePlacer%23LeftRightNodePlacer-method-createLeftRightDataProvider">Online Documentation</a>
 */
 final   fun createLeftRightDataProvider( nodePlacerMap: IDataProvider<Node, INodePlacer> ):IDataProvider<Node, Boolean>
}
}

inline fun LeftRightNodePlacer(
    block: LeftRightNodePlacer.() -> Unit
): LeftRightNodePlacer {
    return LeftRightNodePlacer()
        .apply(block)
}
