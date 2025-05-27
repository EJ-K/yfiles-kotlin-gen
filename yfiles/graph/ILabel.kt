// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Size
import yfiles.lang.InterfaceMetadata
import yfiles.styles.ILabelStyle

/**
 * The interface used in an [IGraph] implementation for labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel">Online Documentation</a>
 */
external interface ILabel : IModelItem {
  /**
   * Gets the index of the label at its [owner][ILabel].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23index">Online Documentation</a>
   */
  final val index: Int
  
  /**
   * Gets a snapshot of the current layout of the label.
   * @see [layoutParameter]
   * @see [ILabelModel.getGeometry]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23layout">Online Documentation</a>
   */
  final val layout: IOrientedRectangle
  
  /**
   * Gets the label model's parameter that determines the positioning of this label.
   * @see [IGraph.setLabelLayoutParameter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23layoutParameter">Online Documentation</a>
   */
  val layoutParameter: ILabelModelParameter
  
  /**
   * Gets the owner of this label.
   * @throws InvalidOperationError if the label has no owner.
   * @see [ILabelOwner.labels]
   * @see [IGraph.addLabel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23owner">Online Documentation</a>
   */
  val owner: ILabelOwner
  
  /**
   * Gets the preferred size of the label with respect to its current contents and the implementation of the visualization.
   * @see [IGraph.setLabelPreferredSize]
   * @see [IGraph.adjustLabelPreferredSize]
   * @see [IGraph.calculateLabelPreferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23preferredSize">Online Documentation</a>
   */
  val preferredSize: Size
  
  /**
   * Gets the style that is responsible for the visual representation of this node in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see [IGraph.setStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23style">Online Documentation</a>
   */
  val style: ILabelStyle
  
  /**
   * Gets the text string associated with this label.
   * @see [IGraph.setLabelText]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabel%23text">Online Documentation</a>
   */
  val text: String

  
  companion object : InterfaceMetadata<ILabel> {
  }
}
