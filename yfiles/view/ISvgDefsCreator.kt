// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Element
import web.dom.Node
import web.svg.SVGElement
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Classes that implement this interface can be placed in the SVGs defs section by the [SvgDefsManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator">Online Documentation</a>
 */
external interface ISvgDefsCreator : YObject {
/**
 * Checks if the specified node references the element represented by this object.
 * @param [context] The current canvas context.
 * @param [node] The SVG node.
 * @param [id] The defs id that has been stored for this instance by the provided context.
 * @return `true` if `node` references the element represented by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator%23ISvgDefsCreator-method-accept">Online Documentation</a>
 */
   fun accept( context: ICanvasContext ,
 node: Node ,
 id: String ):Boolean
/**
 * Creates the element that is put into the defs section of the SVG element.
 * @param [context] The canvas context that can be used to register brushes etc.
 * @return An [SVGElement] that can be put into the defs section of the SVG element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator%23ISvgDefsCreator-method-createDefsElement">Online Documentation</a>
 */
   fun createDefsElement( context: ICanvasContext ):SVGElement
/**
 * Updates the defs element with the current gradient data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator%23ISvgDefsCreator-method-updateDefsElement">Online Documentation</a>
 */
   fun updateDefsElement( context: ICanvasContext ,
 oldElement: SVGElement )

companion object : InterfaceMetadata<ISvgDefsCreator> {
/**
 * Determine whether the given element has an attribute with the given name that references the id in the defs element.
 * @param [element] The element to inspect
 * @param [attributeName] The attribute to check
 * @param [defsId] The id in the defs section
 * @return Whether the attribute is equal to "url(#{defsId})"
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator%23ISvgDefsCreator-defaultmethod-isAttributeReference">Online Documentation</a>
 */
   fun isAttributeReference( element: Element ,
 attributeName: String ,
 defsId: String ):Boolean
/**
 * Checks whether the given DOM `node` is an SVG `use` element that references an element with the specified `id` in the local DOM.
 * @param [node] The DOM node to inspect.
 * @param [id] The id of the referenced element.
 * @return `true` if the specified element references the element; otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISvgDefsCreator%23ISvgDefsCreator-defaultmethod-isUseReference">Online Documentation</a>
 */
   fun isUseReference( node: Node? ,
 id: String ):Boolean
}
}
