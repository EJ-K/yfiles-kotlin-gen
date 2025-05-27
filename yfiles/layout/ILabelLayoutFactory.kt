// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.algorithms.YOrientedRectangle
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * [ILabelLayoutFactory] provides methods to create, add and remove node/edge labels for [LayoutGraph]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory">Online Documentation</a>
 */
external interface ILabelLayoutFactory : YObject {
/**
 * Gets the graph associated with this label factory instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23graph">Online Documentation</a>
 */
val graph: LayoutGraph
/**
 * Adds the given node label layout to the given node.
 * @param [node] the node
 * @param [labelLayout] the node label layout that should be added to the given node
 * @throws ArgumentError if the given label layout has already been added to the graph
 * @see [createLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-addLabelLayout(Node,INodeLabelLayout)">Online Documentation</a>
 */
   fun addLabelLayout( node: Node ,
 labelLayout: INodeLabelLayout )
/**
 * Adds the given [IEdgeLabelLayout] to the given edge.
 * @param [edge] the edge
 * @param [labelLayout] the edge label layout that should be added to the given edge
 * @throws ArgumentError if the given label layout has already been added to the graph
 * @see [createLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-addLabelLayout(Edge,IEdgeLabelLayout)">Online Documentation</a>
 */
   fun addLabelLayout( edge: Edge ,
 labelLayout: IEdgeLabelLayout )
/**
 * Creates a new [ILabelLayout] for the given node.
 * @param [node] the node
 * @param [orientedBox] the box specifying the size and location of the label
 * @return a new node label layout
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-createLabelLayout(Node,YOrientedRectangle)">Online Documentation</a>
 */
   fun createLabelLayout( node: Node ,
 orientedBox: YOrientedRectangle ):INodeLabelLayout
/**
 * Creates a new [ILabelLayout] for the given edge.
 * @param [edge] the edge
 * @param [orientedBox] the box specifying the size and location of the label
 * @return a new edge label layout
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-createLabelLayout(Edge,YOrientedRectangle)">Online Documentation</a>
 */
   fun createLabelLayout( edge: Edge ,
 orientedBox: YOrientedRectangle ):IEdgeLabelLayout
/**
 * Creates a new [ILabelLayout] for the given node.
 * @param [node] the node
 * @param [orientedBox] the box specifying the size and location of the label
 * @param [model] specifies the model of the created node label
 * @return a new node label layout
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-createLabelLayout(Node,YOrientedRectangle,INodeLabelLayoutModel)">Online Documentation</a>
 */
   fun createLabelLayout( node: Node ,
 orientedBox: YOrientedRectangle ,
 model: INodeLabelLayoutModel ):INodeLabelLayout
/**
 * Creates a new [ILabelLayout] for the given edge.
 * @param [edge] the edge
 * @param [orientedBox] the box specifying the size and location of the label
 * @param [model] specifies the model of the created edge label
 * @param [descriptor] specifies the preferred placement descriptor of the created label. If this value is `null`, the default descriptor is used
 * @return a new edge label layout
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-createLabelLayout(Edge,YOrientedRectangle,IEdgeLabelLayoutModel,PreferredPlacementDescriptor)">Online Documentation</a>
 */
   fun createLabelLayout( edge: Edge ,
 orientedBox: YOrientedRectangle ,
 model: IEdgeLabelLayoutModel ,
 descriptor: PreferredPlacementDescriptor? ):IEdgeLabelLayout
/**
 * Removes the given node label layout from the given node.
 * @param [node] the node
 * @param [labelLayout] the label layout that should be removed from the given node
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-removeLabelLayout(Node,INodeLabelLayout)">Online Documentation</a>
 */
   fun removeLabelLayout( node: Node ,
 labelLayout: INodeLabelLayout )
/**
 * Removes the given [IEdgeLabelLayout] from the given edge.
 * @param [edge] the edge
 * @param [labelLayout] the label layout that should be removed from the given edge
 * @see [addLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayoutFactory%23ILabelLayoutFactory-method-removeLabelLayout(Edge,IEdgeLabelLayout)">Online Documentation</a>
 */
   fun removeLabelLayout( edge: Edge ,
 labelLayout: IEdgeLabelLayout )

companion object : InterfaceMetadata<ILabelLayoutFactory> {
}
}
