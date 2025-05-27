// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.styles.IPortStyle

/**
 * Allows the use of an [IPortStyle] to render the selection, highlight or focus indicator of ports.
 * @see [NodeStyleDecorationInstaller]
 * @see [EdgeStyleDecorationInstaller]
 * @see [LabelStyleDecorationInstaller]
 * @see [IndicatorPortStyleDecorator][yfiles.styles.IndicatorPortStyleDecorator]
 * @see [GraphSelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleDecorationInstaller">Online Documentation</a>
 * 
 * @constructor Create a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleDecorationInstaller%23PortStyleDecorationInstaller-constructor-PortStyleDecorationInstaller">Online Documentation</a>
 */
external open class PortStyleDecorationInstaller  () : ISelectionIndicatorInstaller<IPort>, IHighlightIndicatorInstaller<IPort>, IFocusIndicatorInstaller<IPort> {

/**
 * Gets or sets the style to use for the rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleDecorationInstaller%23portStyle">Online Documentation</a>
 */
final var portStyle: IPortStyle
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleDecorationInstaller%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Installs a rendering for the `item` if it is an [IPort].
 * @param [context] The canvas context.
 * @param [group] The canvas object group to add the newly created canvas object to.
 * @param [item] The item to install.
 * @return The canvas object representing the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyleDecorationInstaller%23PortStyleDecorationInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: IPort ):ICanvasObject?

companion object : ClassMetadata<PortStyleDecorationInstaller> {
}
}

inline fun PortStyleDecorationInstaller(
    block: PortStyleDecorationInstaller.() -> Unit
): PortStyleDecorationInstaller {
    return PortStyleDecorationInstaller()
        .apply(block)
}
