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
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.ILabelStyle

/**
 * A mutable implementation of the [ILabel] interface that can be used without an [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel">Online Documentation</a>
 * 
 * @constructor Creates an instance of the [SimpleLabel] class with default [lookup][DefaultGraph.DEFAULT_LABEL_LOOKUP], an instance of [VoidLabelStyle][yfiles.styles.VoidLabelStyle] and the given [parameter][ILabelModelParameter], text, and owner.
 * @param [owner] The label's owner.
 * @param [text] The label's text.
 * @param [layoutParameter] The parameter that describes the label's layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-constructor-SimpleLabel">Online Documentation</a>
 * 
 * @property owner
 * Gets or sets the owner of this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23owner">Online Documentation</a>
 * 
 * @property text
 * Gets or sets the text string associated with this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23text">Online Documentation</a>
 * 
 * @property layoutParameter
 * Gets or sets the label model's parameter that determines the positioning of this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23layoutParameter">Online Documentation</a>
 */
external open class SimpleLabel  (
final override var owner: ILabelOwner? = definedExternally,
final override var text: String = definedExternally,
final override var layoutParameter: ILabelModelParameter = definedExternally) : ILabel {

/**
 * Gets or sets the [ILookup] implementation used for calls to [lookup] on this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23lookupImplementation">Online Documentation</a>
 */
final var lookupImplementation: ILookup?
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
 * Gets the [ILabelStyleRenderer.getPreferredSize] from the labels style and sets the [preferredSize] to that value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-method-adoptPreferredSizeFromStyle">Online Documentation</a>
 */
 open   fun adoptPreferredSizeFromStyle()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SimpleLabel%23SimpleLabel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SimpleLabel> {
}
}

inline fun SimpleLabel(
    block: SimpleLabel.() -> Unit
): SimpleLabel {
    return SimpleLabel()
        .apply(block)
}
