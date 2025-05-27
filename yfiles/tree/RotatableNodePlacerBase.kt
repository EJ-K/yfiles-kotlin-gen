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
import yfiles.algorithms.YPoint
import yfiles.collections.IComparer
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.PortConstraint

/**
 * Abstract base class for [INodePlacer]s that support rotations of the subtrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [RotatableNodePlacerBase] whose direction is specified by the given transformation matrix.
 * @param [modificationMatrix] the transformation matrix for the [INodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-constructor-RotatableNodePlacerBase">Online Documentation</a>
 * 
 * @property modificationMatrix
 * Gets the modification matrix that defines the direction of the subtree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23modificationMatrix">Online Documentation</a>
 */
external abstract class RotatableNodePlacerBase 
protected constructor (
open val modificationMatrix: RotatableNodePlacerMatrix) : IFromSketchNodePlacer {

/**
 * Gets or sets whether or not nodes are placed so that the source and target port of an edge are aligned.
 * 
 * Default value - `false`. Ports are not aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23alignPorts">Online Documentation</a>
 */
open var alignPorts: Boolean
/**
 * The list containing the created children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23createdChildren">Online Documentation</a>
 */
protected final var createdChildren: IList<out Node>
/**
 * The graph instance this [INodePlacer] is working on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * The provider of [SubtreeShape]s for single nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23nodeShapeProvider">Online Documentation</a>
 */
protected final var nodeShapeProvider: IDataProvider<Node, SubtreeShape>
/**
 * Gets or sets the spacing between subtrees.
 * 
 * Default value - `20`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * The provider of [SubtreeShape]s for whole subtrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23subtreeShapeProvider">Online Documentation</a>
 */
protected final var subtreeShapeProvider: IDataProvider<Node, SubtreeShape>
/**
 * Creates a [IComparer] for outgoing edges that takes the rotation into account.
 * @return the [IComparer] that considers the rotation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-createComparer">Online Documentation</a>
 */
 open   fun createComparer():IComparer<Edge>?
/**
 * Delegates to [createComparer].
 * @return the From Sketch [IComparer]
 * @see [createComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-createFromSketchComparer">Online Documentation</a>
 */
 override   fun createFromSketchComparer():IComparer<Node>
/**
 * Creates an optional [IProcessor] for pre- and post-processing.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @param [child] the child node
 * @return a direction specifier as defined in the [INodePlacer] interface
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-determineChildConnector">Online Documentation</a>
 */
 abstract protected   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Provides the direction of the connector to the [SubtreeShape] for each child node.
 * @param [localRoot] the local root
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see [determineChildConnector]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Returns the rotated subtree shape for the given node.
 * @param [node] the node
 * @return the subtree shape for the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-getNodeShape">Online Documentation</a>
 */
 open protected   fun getNodeShape( node: Node ):RotatedSubtreeShape
/**
 * Returns the target [PortConstraint] for the local root's incoming edge.
 * @param [localRoot] the local root
 * @return the [PortConstraint] for the incoming edge of the local root or [PortSide.ANY][yfiles.layout.PortSide.ANY] if no [PortConstraint] is assigned for that edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-getPortConstraint">Online Documentation</a>
 */
 open protected   fun getPortConstraint( localRoot: Node ):PortConstraint
/**
 * Returns the absolute source point of the given edge depending on the rotation of this [INodePlacer].
 * @param [edge] the edge whose absolute source point should be calculated
 * @return the translated absolute source point for the given edge and current modification matrix
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-getSourcePointAbs">Online Documentation</a>
 */
 open protected   fun getSourcePointAbs( edge: Edge ):YPoint
/**
 * Returns the rotated subtree shape for the subtree rooted at the given node.
 * @param [node] the local root node
 * @return the rotated subtree shape of the subtree rooted at the given local root node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-getSubtreeShape">Online Documentation</a>
 */
 open protected   fun getSubtreeShape( node: Node ):RotatedSubtreeShape
/**
 * Initializes the local data structures and then delegates the work to the abstract variant of this method ([placeSubtreeOfNode]).
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged [SubtreeShape] for the subtree rooted at the local root node
 * @see [placeSubtreeOfNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape
/**
 * Arranges the local root relative to the rotated subtree shapes of its children.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-placeSubtreeOfNode">Online Documentation</a>
 */
 abstract protected   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape
/**
 * Translates the given real direction of the resulting layout to the model direction of this [RotatableNodePlacerBase].
 * @param [realDirection] the real direction
 * @return the model direction
 * @throws ArgumentError if translation for the given real direction is not implemented
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-translateDirectionToModel">Online Documentation</a>
 */
 open protected   fun translateDirectionToModel( realDirection: ParentConnectorDirection ):Int
/**
 * Translates the given model direction to the real direction in the resulting layout.
 * @param [modelDirection] the model direction
 * @return the real direction
 * @throws ArgumentError if translation for the given model direction is not implemented
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-translateDirectionToReal">Online Documentation</a>
 */
 open protected   fun translateDirectionToReal( modelDirection: ParentConnectorDirection ):Int

companion object : ClassMetadata<RotatableNodePlacerBase> {
/**
 * Translates a point from the real layout direction to the model direction using the given modification matrix.
 * @param [modificationMatrix] the modification matrix to use for the translation
 * @param [realWorldPoint] the point with coordinates from the real world
 * @return the translated point with coordinates from the model
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerBase%23RotatableNodePlacerBase-method-translatePoint">Online Documentation</a>
 */
 final   fun translatePoint( modificationMatrix: RotatableNodePlacerMatrix ,
 realWorldPoint: YPoint ):YPoint?
}
}
