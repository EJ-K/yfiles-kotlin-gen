// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [CopiedLayoutGraph] is a [LayoutGraph] that serves as a **copy of another graph** with layout information.
 * @see [BufferedLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph">Online Documentation</a>
 * 
 * @constructor Creates a new [CopiedLayoutGraph] instance which is a copy of the given graph.
 * @param [graph] the original graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-constructor-CopiedLayoutGraph">Online Documentation</a>
 */
external open class CopiedLayoutGraph  ( graph: LayoutGraph ) : LayoutGraph {

/**
 * Writes the current layout information of all elements of this copied graph to the original graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-commitLayoutToOriginalGraph">Online Documentation</a>
 */
 open   fun commitLayoutToOriginalGraph()
/**
 * Creates an edge in the copied graph that corresponds to the given original edge.
 * @param [originalEdge] the original edge
 * @return the copy of the original edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-createCopiedEdge">Online Documentation</a>
 */
 open   fun createCopiedEdge( originalEdge: YObject ):Edge
/**
 * Creates a node in the copied graph that corresponds to the given original node.
 * @param [originalNode] the original node
 * @return the copy of the original node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-createCopiedNode">Online Documentation</a>
 */
 open   fun createCopiedNode( originalNode: YObject ):Node
/**
 * Creates a new [ILabelLayoutFactory] for this [CopiedLayoutGraph].
 * @return the new label layout factory
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-createLabelFactory">Online Documentation</a>
 */
 override   fun createLabelFactory():ILabelLayoutFactory
/**
 * Returns the copied edge that corresponds to the given original edge.
 * @param [originalEdge] an edge of the original graph whose copy resides in this graph
 * @return an edge in this graph that is the copy of the given original edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getCopiedEdge">Online Documentation</a>
 */
 open   fun getCopiedEdge( originalEdge: YObject ):Edge?
/**
 * Returns the copied node that corresponds to the given original node.
 * @param [originalNode] a node of the original graph whose copy resides in this graph
 * @return a node in this graph that is the copy of the given original node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getCopiedNode">Online Documentation</a>
 */
 open   fun getCopiedNode( originalNode: YObject ):Node?
/**
 * Returns the layout information for all labels associated with the given node of the copied graph.
 * @param [node] the node
 * @return the label layout information for all labels of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getLabelLayout">Online Documentation</a>
 */
 override   fun getLabelLayout( node: Node ):ReadonlyArray<INodeLabelLayout>
/**
 * Returns the layout information for all labels associated with the given edge of the copied graph.
 * @param [edge] the edge
 * @return the label layout information for all labels of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getLabelLayout">Online Documentation</a>
 */
 override   fun getLabelLayout( edge: Edge ):ReadonlyArray<IEdgeLabelLayout>
/**
 * Returns the layout information for the given node of the copied graph.
 * @param [node] the node
 * @return the layout information for the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getLayout">Online Documentation</a>
 */
 override   fun getLayout( node: Node ):INodeLayout
/**
 * Returns the layout information for the given edge of the copied graph.
 * @param [edge] the edge
 * @return the layout information for the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getLayout">Online Documentation</a>
 */
 override   fun getLayout( edge: Edge ):IEdgeLayout
/**
 * Returns the original edge that corresponds to the given copied edge.
 * @param [copiedEdge] the edge in this graph that is a copy of the returned edge
 * @return the edge in the original graph whose copy is the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getOriginalEdge">Online Documentation</a>
 */
 open   fun getOriginalEdge( copiedEdge: Edge ):YObject?
/**
 * Returns the original node that corresponds to the given copied node.
 * @param [copiedNode] the node in this graph that is a copy of the returned node
 * @return the node in the original graph whose copy is the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getOriginalNode">Online Documentation</a>
 */
 open   fun getOriginalNode( copiedNode: Node ):YObject?
/**
 * Returns the edge of the copied graph to which the given [IEdgeLabelLayout] belongs.
 * @param [labelLayout] a label layout information of an edge in the copied graph
 * @return the edge that belongs to the given label layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getOwnerEdge">Online Documentation</a>
 */
 override   fun getOwnerEdge( labelLayout: IEdgeLabelLayout ):Edge
/**
 * Returns the node of the copied graph to which the given [INodeLabelLayout] belongs.
 * @param [labelLayout] a label layout information of a node in the copied graph
 * @return the node that belongs to the given label layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-getOwnerNode">Online Documentation</a>
 */
 override   fun getOwnerNode( labelLayout: INodeLabelLayout ):Node
/**
 * Synchronizes the structure of the [CopiedLayoutGraph] with the actual structure of the underlying original graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CopiedLayoutGraph%23CopiedLayoutGraph-method-syncStructure">Online Documentation</a>
 */
 open   fun syncStructure()

companion object : ClassMetadata<CopiedLayoutGraph> {
}
}
