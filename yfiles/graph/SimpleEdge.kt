// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.styles.IEdgeStyle

/**
 * A mutable implementation of the [IEdge] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge">Online Documentation</a>
 * 
 * @constructor Creates an edge with a [default lookup][Graph], and, optionally, the given source and target ports.
 * @param [sourcePort] The source port for the edge.
 * @param [targetPort] The target port for the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23SimpleEdge-constructor-SimpleEdge">Online Documentation</a>
 */
external class SimpleEdge (
  sourcePort: IPort?  = definedExternally,
  targetPort: IPort?  = definedExternally,
) : IEdge {
  /**
   * Gets or sets the collection of [bends][IBend] that describe the geometry of this edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23bends">Online Documentation</a>
   */
  final override var bends: IListEnumerable<IBend>
  
  /**
   * Gets or sets the collection of [labels][ILabel] that are owned by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23labels">Online Documentation</a>
   */
  final override var labels: IListEnumerable<ILabel>
  
  /**
   * Gets or sets the collection of [ports][IPort] that are owned by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23ports">Online Documentation</a>
   */
  final override var ports: IListEnumerable<IPort>
  
  /**
   * Gets or sets the source port instance this edge is connected to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23sourcePort">Online Documentation</a>
   */
  final override var sourcePort: IPort
  
  /**
   * Gets or sets the style that is responsible for the visual representation of this edge in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23style">Online Documentation</a>
   */
  final override var style: IEdgeStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets or sets the target port instance this edge is connected to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23targetPort">Online Documentation</a>
   */
  final override var targetPort: IPort
  
  /**
   * Gets a [EdgeDecorator] to modify the ports [ILookup][yfiles.collections.ILookup].
   * @return A [EdgeDecorator] for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23SimpleEdge-method-getDecorator">Online Documentation</a>
   */
  fun getDecorator(): EdgeDecorator
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleEdge%23SimpleEdge-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<SimpleEdge> {
  }
}

inline fun SimpleEdge(
    block: SimpleEdge.() -> Unit
): SimpleEdge {
    return SimpleEdge()
        .apply(block)
}
