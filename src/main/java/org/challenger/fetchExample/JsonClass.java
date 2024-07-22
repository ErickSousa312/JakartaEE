package org.challenger.fetchExample;

import jakarta.json.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonClass {
    JsonObject jsonObject = new JsonObject() {

        @Override
        public JsonArray getJsonArray(String name) {
            return null;
        }

        @Override
        public JsonObject getJsonObject(String name) {
            return null;
        }

        @Override
        public JsonNumber getJsonNumber(String name) {
            return null;
        }

        @Override
        public JsonString getJsonString(String name) {
            return null;
        }

        @Override
        public String getString(String name) {
            return "";
        }

        @Override
        public String getString(String name, String defaultValue) {
            return "";
        }

        @Override
        public int getInt(String name) {
            return 0;
        }

        @Override
        public int getInt(String name, int defaultValue) {
            return 0;
        }

        @Override
        public boolean getBoolean(String name) {
            return false;
        }

        @Override
        public boolean getBoolean(String name, boolean defaultValue) {
            return false;
        }

        @Override
        public boolean isNull(String name) {
            return false;
        }

        @Override
        public ValueType getValueType() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public JsonValue get(Object key) {
            return null;
        }

        @Nullable
        @Override
        public JsonValue put(String key, JsonValue value) {
            return null;
        }

        @Override
        public JsonValue remove(Object key) {
            return null;
        }

        @Override
        public void putAll(@NotNull Map<? extends String, ? extends JsonValue> m) {

        }

        @Override
        public void clear() {

        }

        @NotNull
        @Override
        public Set<String> keySet() {
            return Set.of();
        }

        @NotNull
        @Override
        public Collection<JsonValue> values() {
            return List.of();
        }

        @NotNull
        @Override
        public Set<Entry<String, JsonValue>> entrySet() {
            return Set.of();
        }


    };
    public String toStringFromJson(JsonClass json){
        return Json.createObjectBuilder(json.jsonObject).build().toString();
    }

}
