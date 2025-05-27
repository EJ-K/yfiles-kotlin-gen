// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata
import yfiles.styles.ILabelStyle

/**
 * A mutable implementation of the [ILabel] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel">Online Documentation</a>
 * 
 * @constructor Creates an instance of the [SimpleLabel] class with default [lookup][Graph], [VOID_LABEL_STYLE][ILabelStyle] as style, and the given [parameter][ILabelModelParameter], text, and owner.
 * @param [owner] The label's owner. The default value is `null`.
 * @param [text] The label's text. The default value is an empty string.
 * @param [layoutParameter] The parameter that describes the label's layout. The default value places the label at [ORIGIN][yfiles.geometry.Point] with the [FreeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-constructor-SimpleLabel">Online Documentation</a>
 */
external class SimpleLabel (
  owner: ILabelOwner?  = definedExternally,
  text: String  = definedExternally,
  layoutParameter: ILabelModelParameter  = definedExternally,
) : ILabel {
  /**
   * Gets or sets the label model's parameter that determines the positioning of this label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23layoutParameter">Online Documentation</a>
   */
  final override var layoutParameter: ILabelModelParameter
  
  /**
   * Gets or sets the owner of this label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23owner">Online Documentation</a>
   */
  final override var owner: ILabelOwner
  
  /**
   * Gets or sets the preferred size of the label with respect to its current contents and the implementation of the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23preferredSize">Online Documentation</a>
   */
  final override var preferredSize: Size
  
  /**
   * Gets or sets the style that is responsible for the visual representation of this node in a [CanvasComponent][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23style">Online Documentation</a>
   */
  final override var style: ILabelStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets or sets the text string associated with this label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23text">Online Documentation</a>
   */
  final override var text: String
  
  /**
   * Gets the [getPreferredSize][ILabelStyleRenderer] from the label's style and sets the [preferredSize][SimpleLabel] to that value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-method-adoptPreferredSizeFromStyle">Online Documentation</a>
   */
  fun adoptPreferredSizeFromStyle()
  
  /**
   * Gets a [LabelDecorator] to modify the ports [ILookup][yfiles.collections.ILookup].
   * @return A [LabelDecorator] for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-method-getDecorator">Online Documentation</a>
   */
  fun getDecorator(): LabelDecorator
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  companion object : ClassMetadata<SimpleLabel> {
  }
}

inline fun SimpleLabel(
    block: SimpleLabel.() -> Unit
): SimpleLabel {
    return SimpleLabel()
        .apply(block)
}
