// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Routing specifier that routes edges between different group contents non-recursively.
 * @see [EdgeLayoutDescriptor.recursiveEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveEdgeStyle">Online Documentation</a>
 */
external sealed class RecursiveEdgeStyle: YEnum<RecursiveEdgeStyle> {
   companion object: EnumMetadata<RecursiveEdgeStyle> {
       /**
 * Routing specifier that routes edges between different group contents non-recursively.
 * 
 * Value - `0`
 * @see [EdgeLayoutDescriptor.recursiveEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveEdgeStyle%23OFF">Online Documentation</a>
 */
val OFF: RecursiveEdgeStyle

/**
 * Routing specifier that routes edges between different group contents recursively and directed.
 * 
 * Value - `1`
 * @see [EdgeLayoutDescriptor.recursiveEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveEdgeStyle%23DIRECTED">Online Documentation</a>
 */
val DIRECTED: RecursiveEdgeStyle

/**
 * Routing specifier that routes edges between different group contents recursively and undirected.
 * 
 * Value - `2`
 * @see [EdgeLayoutDescriptor.recursiveEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveEdgeStyle%23UNDIRECTED">Online Documentation</a>
 */
val UNDIRECTED: RecursiveEdgeStyle
   }
}
