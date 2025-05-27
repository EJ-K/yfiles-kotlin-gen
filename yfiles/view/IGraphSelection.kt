// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IObservableCollection
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata

/**
 * Manages the selection state of items in an [IGraph][yfiles.graph.IGraph] instance.
 * @see [IObservableCollection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection">Online Documentation</a>
 */
external interface IGraphSelection : IObservableCollection<IModelItem> {
  /**
   * Gets an [IObservableCollection] of the selected bends.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23bends">Online Documentation</a>
   */
  val bends: IObservableCollection<IBend>
  
  /**
   * Gets an [IObservableCollection] of the selected edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23edges">Online Documentation</a>
   */
  val edges: IObservableCollection<IEdge>
  
  /**
   * Gets an [IObservableCollection] of the selected labels.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23labels">Online Documentation</a>
   */
  val labels: IObservableCollection<ILabel>
  
  /**
   * Gets an [IObservableCollection] of the selected nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23nodes">Online Documentation</a>
   */
  val nodes: IObservableCollection<INode>
  
  /**
   * Gets an [IObservableCollection] of the selected ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphSelection%23ports">Online Documentation</a>
   */
  val ports: IObservableCollection<IPort>

  
  companion object : InterfaceMetadata<IGraphSelection> {
  }
}
